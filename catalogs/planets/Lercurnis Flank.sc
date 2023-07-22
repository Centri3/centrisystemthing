Planet	"Flank/Lercurnis III"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Neptune"
	Mass            8.0239
	Radius          17528
	InertiaMoment   0.19211
	Oblateness      0.023926
	RotationPeriod  26.446
	RotationEpoch   1451545
	Obliquity       15
	EqAscendNode    -66.981

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_flank.cfg"
		SurfStyle       0.61885
		Randomize      (-0.509, -0.278, -0.885)
		detailScale     256
		tropicLatitude  0.49453
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.38168
		stripeFluct     0.10687
		stripeTwist     11.174
		cycloneMagn     14.198
		cycloneFreq     0.50357
		cycloneDensity  0.49278
		cycloneOctaves  0
		cycloneMagn2     0.45915
		cycloneFreq2     0.81816
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      18.28
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.099609
		Velocity        -136.42
		BumpHeight      1
		Gamma           0.46963
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.62595
		mainFreq        2.2672
		mainOctaves     12
		Coverage        0.10194
		stripeZones     0.38168
		stripeFluct     0.10687
		stripeTwist     11.174
	}

	Clouds
	{
		Height          0.099609
		Velocity        -732.19
		BumpHeight      1
		Gamma           0.48643
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  3
		Opacity         0.65649
		mainFreq        2.2672
		mainOctaves     12
		Coverage        0.10194
		stripeZones     0.38168
		stripeFluct     0.10687
		stripeTwist     11.174
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank"
		Height          250
		Density         2358.9
		Pressure        90015
		Bright          2
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.876
			He        	6.7498
			CH4       	0.28833
			N2        	0.045263
			NH3       	0.024821
			O2        	0.0072979
			C2H2      	0.0039761
			C2H4      	0.0014913
			Ne        	0.0011449
			Ar        	0.00090889
			C2H6      	0.00061476
			C3H8      	0.00037943
			C8H18     	0.00033787
			H2O       	3.7357e-06
			H2S       	1.7801e-06
			CO2       	1.587e-06
			Kr        	4.1074e-07
			Xe        	4.2088e-08
			SO2       	1.1585e-08
			CO        	3.7432e-10
			Cl2       	3.5389e-10
		}
	}

	Aurora
	{
		Height         400
		NorthLat       90
		NorthLon       0
		NorthRadius    10197
		NorthWidth     1549.5
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 73.1
		NorthMoveSpeed 1.1589
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    10197
		SouthWidth     1549.5
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 68.394
		SouthMoveSpeed 0.69868
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          552.802057
		SemiMajorAxis   62.6518253
		Eccentricity    0.0763358779
		Inclination     2
		AscendingNode   129.160305
		ArgOfPericenter -90.6870229
		MeanAnomaly     68.7022901
	}
}

