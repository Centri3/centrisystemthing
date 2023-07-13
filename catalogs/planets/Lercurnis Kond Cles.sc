Planet	"Cles/Lercurnis B VIIIa"
{
	ParentBody     "Cles-Gort bar"
	Class          "Jupiter"
	Mass            1167.4
	Radius          77956
	InertiaMoment   0.23631
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_cles.cfg"
		SurfStyle       0.91488
		Randomize      (0.307, -0.030, 0.795)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
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
		stripeZones     1.145
		stripeFluct     0.68702
		stripeTwist     12.897
		cycloneMagn     6.0531
		cycloneFreq     1.1171
		cycloneDensity  0.33523
		cycloneOctaves  0
		cycloneMagn2     0.37816
		cycloneFreq2     0.88186
		cycloneLatitude2 0.85
		cycloneOctaves2  0
		BumpHeight      7.1624
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Gamma           0.6
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.10156
		Velocity        -27.019
		BumpHeight      4.4161
		BumpOffset      0.001
		Gamma           0.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  2
		Opacity         0.1
		mainFreq        3
		mainOctaves     15
		Coverage        0.038168
		stripeZones     1.145
		stripeFluct     0.68702
		stripeTwist     12.897
	}

	Clouds
	{
		Height          0.10156
		Velocity        -365.89
		BumpHeight      4.4162
		Gamma           0.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		mainFreq        3
		mainOctaves     15
		Coverage        0.038168
		stripeZones     1.145
		stripeFluct     0.68702
		stripeTwist     12.897
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles"
		Height          500
		Density         10000
		Pressure        1e+06
		Bright          5
		Opacity         0.2
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	91.851
			He        	7.7756
			CH4       	0.29476
			N2        	0.035874
			NH3       	0.027693
			O2        	0.0074259
			C2H2      	0.0030776
			C2H4      	0.0014153
			Ne        	0.001125
			Ar        	0.00084191
			C2H6      	0.00058834
			C8H18     	0.00034848
			C3H8      	0.00032808
			H2O       	3.8317e-06
			H2S       	1.9014e-06
			CO2       	1.5355e-06
			Kr        	3.9323e-07
			Xe        	4.8065e-08
			SO2       	1.1265e-08
			CO        	3.6731e-10
			Cl2       	3.3009e-10
		}
	}

	Aurora
	{
		Height         1000
		NorthLat       90
		NorthLon       0
		NorthRadius    26877
		NorthWidth     26877
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 68.782
		NorthMoveSpeed 100
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    25986
		SouthWidth     31272
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 67.982
		SouthMoveSpeed 1.4904
		SouthParticles 100000
		TopColor    (1.000 0.000 0.562)
		BottomColor (0.453 0.000 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0601782471
		SemiMajorAxis   0.000198709486
		Eccentricity    0.05
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

