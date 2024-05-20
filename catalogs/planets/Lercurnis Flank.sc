Planet	"Flank/Lercurnis III"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Neptune"
	Mass            8.02
	Radius          1.75e+04
	InertiaMoment   0.192
	Oblateness      0.0239
	RotationPeriod  26.4
	RotationEpoch   1451545
	Obliquity       15
	EqAscendNode    -67

	EndogenousHeating 0
	Albedo          0.4
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_flank.cfg"
		SurfStyle       0.619
		Randomize      (0.626, 1.023, 0.656)
		detailScale     256
		tropicLatitude  0.495
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
		stripeZones     10
		stripeFluct     2
		stripeTwist     20
		cycloneMagn     14.2
		cycloneFreq     0.504
		cycloneDensity  0.493
		cycloneOctaves  0
		cycloneMagn2     0.459
		cycloneFreq2     0.818
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      18.3
		RoughnessWater  0.399
		RoughnessIce    0.234
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
		Height          0.0996
		Velocity        -136
		BumpHeight      1
		Gamma           2.37
		Hapke           0.481
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        2.22
		mainOctaves     15
		Coverage        0.102
		stripeZones     10
		stripeFluct     2
		stripeTwist     20
	}

	Clouds
	{
		Height          0.0996
		Velocity        -732
		BumpHeight      1
		Gamma           0.486
		Hapke           0.466
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  10
		mainFreq        2.22
		mainOctaves     15
		Coverage        0.102
		stripeZones     10
		stripeFluct     2
		stripeTwist     20
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank"
		Height          150
		Density         2.36e+03
		Pressure        9e+04
		Bright          2
		Opacity         0.7
		SkyLight        1
		Hue             0
		Saturation      2

		Composition
		{
			H2        	92.9
			He        	6.75
			CH4       	0.288
			N2        	0.0453
			NH3       	0.0248
			O2        	0.0073
			C2H2      	0.00398
			C2H4      	0.00149
			Ne        	0.00114
			Ar        	0.000909
			C2H6      	0.000615
			C3H8      	0.000379
			C8H18     	0.000338
			H2O       	3.74e-06
			H2S       	1.78e-06
			CO2       	1.59e-06
			Kr        	4.11e-07
			Xe        	4.21e-08
			SO2       	1.16e-08
			CO        	3.74e-10
			Cl2       	3.54e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  163
	}

	Aurora
	{
		Height         400
		NorthLat       90
		NorthLon       0
		NorthRadius    1.02e+04
		NorthWidth     1.55e+03
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 73.1
		NorthMoveSpeed 1.16
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    1.02e+04
		SouthWidth     1.55e+03
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 68.4
		SouthMoveSpeed 0.699
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

