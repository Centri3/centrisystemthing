Planet	"End/Lercurnis A I"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            15
	Radius          19969
	InertiaMoment   0.3336
	Oblateness      0.002346
	RotationPeriod  11918
	RotationOffset  -65
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.772 0.567)

    Interior
    {
        Composition
        {
            Hydrogen    0
            Helium      0.001
            Carbides    0
            Ices        90
            Silicates   9
            Metals      1
        }
    }

	Surface
	{
		Preset         "lercurnis_fragmunt_end.cfg"
		SurfStyle       0.50622
		Randomize      (-0.968, 0.341, 0.495)
		colorDistMagn   0.045421
		colorDistFreq   932.23
		detailScale     256
		drivenDarkening 1
		seaLevel        0.51145
		snowLevel       2
		tropicLatitude  0.8781
		icecapLatitude  1.0229
		icecapHeight    0
		climatePole     0.57252
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21392
		heightTempGrad  0.625
		beachWidth      0.0010388
		tropicWidth     0.07
		mainFreq        2.0348
		venusFreq       1.0229
		venusMagn       0.87786
		mareFreq        0.4
		mareDensity     0.35115
		terraceProb     0.5118
		erosion         0
		montesMagn      0.1
		montesFreq      250
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.035176
		dunesFreq       81.014
		dunesFraction   0.61897
		hillsMagn       2
		hillsFreq       35
		hillsFraction   1
		hills2Fraction  1
		riversMagn      100
		riversFreq      10
		riversSin       10
		riftsMagn       0
		riftsFreq       2.3018
		riftsSin        6.0781
		canyonsMagn     0.39522
		canyonsFreq     2.8645
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.604
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.036
		volcanoMagn     0.68197
		volcanoFreq     0.55127
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.037576
		volcanoRadius   0.49391
		volcanoTemp     389.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     2.7164
		cycloneFreq     0.58332
		cycloneDensity  0.43239
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          25
		Velocity        203.4
		BumpHeight      2.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  0.1
		Opacity         0.39695
		mainFreq        0.29771
		mainOctaves     15
		Coverage        1
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          25
		Velocity        136.23
		BumpHeight      3.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateBright  0.10358
		Opacity         0.38168
		mainFreq        0.29771
		mainOctaves     15
		Coverage        1
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          25
		Velocity        176.78
		BumpHeight      4.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateBright  0.1
		Opacity         0.47328
		mainFreq        0.29771
		mainOctaves     15
		Coverage        1
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Fragmunt End"
		Height          200
		Density         7.3415e-11
		Pressure        1e-09
		Greenhouse      0.043403
		Bright          3
		Opacity         1
		SkyLight        0.52702
		Hue             -0.0093755
		Saturation      0.81899

		Composition
		{
			He        	54.328
			Ne        	24.219
			CH4       	13.231
			N2        	8.2091
			Ar        	0.010641
			CO        	0.0018483
			O2        	0.00039567
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.35959586
		SemiMajorAxis   1.1
		Eccentricity    0
		Inclination     0
		AscendingNode   -63.2061069
		ArgOfPericenter 2.7480916
		MeanAnomaly     0
	}
}

