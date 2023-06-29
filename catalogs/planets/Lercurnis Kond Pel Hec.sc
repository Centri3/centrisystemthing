Moon	"Hec/Lercurnis B VII I"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.16535
	Radius          3529.4
	InertiaMoment   0.32973
	Oblateness      0.029939
	Obliquity       0
	EqAscendNode    125.94
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_hec.cfg"
		SurfStyle       0.65499
		Randomize      (0.027, 0.509, -0.517)
		colorDistMagn   0.092971
		colorDistFreq   338.96
		detailScale     128
		drivenDarkening 0
		seaLevel        0.23664
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.48702
		climatePole     1
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10502
		heightTempGrad  0.375
		beachWidth      0.0010188
		tropicWidth     0.5
		mainFreq        1.145
		venusFreq       0.51908
		venusMagn       0.34351
		mareFreq        1
		mareDensity     1
		terraceProb     0.22295
		erosion         0
		montesMagn      0.05
		montesFreq      150
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.064465
		dunesFreq       36.273
		dunesFraction   0.22346
		hillsMagn       0.1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      25
		riversFreq      10
		riversSin       7
		riftsMagn       57.718
		riftsFreq       3.5492
		riftsSin        5.7077
		canyonsMagn     0.060954
		canyonsFreq     76.404
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0.58715
		craterFreq      5
		craterDensity   1
		craterOctaves   29
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     2519.1
		lavaCoverTidal  0.70992
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.0471
		stripeTwist     0.079111
		cycloneMagn     2.276
		cycloneFreq     0.53909
		cycloneDensity  0.38007
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.2028
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          45
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (1.000 0.810 0.684)
		ModulateBright  0.3
		Opacity         0.36641
		mainFreq        0.74916
		mainOctaves     0
		Coverage        0.59542
		stripeZones     1.0471
		stripeTwist     0.079111
        TempMapMaxTemp  60000
	}

	Clouds
	{
		Height          45
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (1.000 0.701 0.555)
		ModulateBright  0.4
		Opacity         0.45802
		mainFreq        0.74916
		mainOctaves     0
		Coverage        0.59542
		stripeZones     1.0471
		stripeTwist     0.079111
        TempMapMaxTemp  60000
	}

	Clouds
	{
		Height          45
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.56489
		mainFreq        0.74916
		mainOctaves     0
		Coverage        0.59542
		stripeZones     1.0471
		stripeTwist     0.079111
        TempMapMaxTemp  60000
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel Hec"
		Height          250
		Density         -1e+38
		Pressure        100
		Greenhouse      900
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      2

		Composition
		{
			CO2       	99.59
			SO2       	0.40988
			Ar        	9.3092e-05
		}
	}

	Aurora
	{
		Height         200
		NorthLat       90
		NorthLon       0
		NorthRadius    978.18
		NorthWidth     329.4
		NorthRings     5
		NorthBright    0.1
		NorthFlashFreq 7.8186
		NorthMoveSpeed 100
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    978.18
		SouthWidth     329.4
		SouthRings     5
		SouthBright    0.1
		SouthFlashFreq 4.6145
		SouthMoveSpeed 100
		SouthParticles 100000
		TopColor    (1.000 0.000 0.000)
		BottomColor (0.000 0.086 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.336825727
		SemiMajorAxisKm 149597.871
		Eccentricity    0.013
		Inclination     0.01
		AscendingNode   125.938222
		ArgOfPericenter 44.851533
		MeanAnomaly     124.607633
	}
}

