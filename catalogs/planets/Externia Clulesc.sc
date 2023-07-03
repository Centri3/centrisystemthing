Planet	"Clulesc/Externia b"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Neptune"
	Mass            50
	Radius          27813
	InertiaMoment   0.19595
	Oblateness      0.037683
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "externia_clulesc.cfg"
		SurfStyle       0.16061
		Randomize      (0.059, 0.889, 0.840)
		detailScale     256
		tropicLatitude  0.57262
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
		stripeZones     2.0381
		stripeFluct     0.41221
		stripeTwist     8.3881
		cycloneMagn     20
		cycloneFreq     0.44275
		cycloneDensity  0.20611
		cycloneOctaves  1
		cycloneMagn2     0.4904
		cycloneFreq2     0.85819
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      12.348
		RoughnessWater  0.35
		RoughnessIce    0.45
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
		Velocity        296.19
		BumpHeight      4.3826
		Gamma           0.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.25954
		mainFreq        3
		mainOctaves     20
		Coverage        0.064433
		stripeZones     2.0381
		stripeFluct     0.41221
		stripeTwist     8.3881
	}

	Clouds
	{
		Height          0.099609
		Velocity        -441.25
		BumpHeight      14.383
		Gamma           0.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  2
		mainFreq        3
		mainOctaves     20
		Coverage        0.064433
		stripeZones     2.0381
		stripeFluct     0.41221
		stripeTwist     8.3881
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia Clulesc"
		Height          300
		Density         10000
		Pressure        1e+06
		Bright          3
		Opacity         0.5
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.417
			He        	7.2214
			CH4       	0.29384
			N2        	0.029787
			NH3       	0.024674
			O2        	0.0062569
			C2H2      	0.0031669
			C2H4      	0.0013255
			Ne        	0.00088108
			Ar        	0.00083328
			C2H6      	0.00052112
			C3H8      	0.00028804
			C8H18     	0.00028657
			H2O       	3.1591e-06
			H2S       	1.5513e-06
			CO2       	1.286e-06
			Kr        	3.2123e-07
			Xe        	4.0391e-08
			SO2       	8.6329e-09
			Cl2       	3.2202e-10
			CO        	2.9356e-10
		}
	}

	Aurora
	{
		Height         300
		NorthLat       90
		NorthLon       0
		NorthRadius    11881
		NorthWidth     2450.2
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 58.721
		NorthMoveSpeed 0.65618
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    11881
		SouthWidth     2450.2
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 68.701
		SouthMoveSpeed 1.0589
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
		Period          0.0121116736
		SemiMajorAxis   0.0097632912
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

